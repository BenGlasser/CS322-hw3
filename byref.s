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
mini_main:
	pushl	%ebp
	movl	%esp,%ebp
	subl	$4,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	subl	$8,%esp
	#COMPILE ARGS--------------------------------------
	# COMPILE TO STACK-----------------------------------
	movl	-4(%ebp),%eax
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
	movl	%ebp,%esp
	popl	%ebp
	ret
