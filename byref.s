	.file	"byref.s"
	.globl	mini_main
byval:
	pushl	%ebp
	movl	%esp,%ebp
	movl	$1,%eax
	movl	8(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,8(%ebp)
	#--------------------------------------------------
	movl	8(%ebp),%eax
	pushl	%eax
	call	print
	movl	%ebp,%esp
	popl	%ebp
	ret
byref:
	pushl	%ebp
	movl	%esp,%ebp
	movl	$1,%eax
	# COMPILE EXPR REF-----------------------------------
	movl	8(%ebp),%ecx
	movl	(%ecx),%ecx
	# ---------------------------------------------------
	addl	%ecx,%eax
	# ASSIGN REF---------------------------------------
	movl	8(%ebp),%ecx
	movl	%eax,(%ecx)
	#--------------------------------------------------
	# COMPILE EXPR REF-----------------------------------
	movl	8(%ebp),%eax
	movl	(%eax),%eax
	# ---------------------------------------------------
	pushl	%eax
	call	print
	movl	%ebp,%esp
	popl	%ebp
	ret
mini_main:
	pushl	%ebp
	movl	%esp,%ebp
	subl	$4,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	subl	$8,%esp
	#COMPILE ARGS--------------------------------------
	# COMPILE REF TO STACK-------------------------------
	movl	%ebp,%eax
	addl	$-4,%eax
	movl	%eax,(%esp)
	# ---------------------------------------------------
	#--------------------------------------------------
	call	byref
	addl	$8,%esp
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	# COMPILE TO STACK-----------------------------------
	movl	-4(%ebp),%eax
	movl	%eax,(%esp)
	# ---------------------------------------------------
	call	byval
	addl	$4,%esp
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	subl	$4,%esp
	#COMPILE ARGS--------------------------------------
	movl	$7,%eax
	movl	$6,%ecx
	imull	%ecx,%eax
	# COMPILE TO STACK-----------------------------------
	movl	$7,%eax
	movl	$6,%ecx
	imull	%ecx,%eax
	movl	%eax,(%esp)
	# ---------------------------------------------------
	#--------------------------------------------------
	call	byref
	addl	$4,%esp
	# COMPILE TO STACK-----------------------------------
	movl	$7,%eax
	movl	$6,%ecx
	imull	%ecx,%eax
	movl	%eax,(%esp)
	# ---------------------------------------------------
	call	byval
	movl	%ebp,%esp
	popl	%ebp
	ret
