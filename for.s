	.file	"for.s"
	.globl	mini_main
mini_main:
	# PROLOGUE-------------------------------------------
	pushl	%ebp
	movl	%esp,%ebp
	#----------------------------------------------------
	subl	$20,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	movl	$0,%eax
	movl	%eax,-8(%ebp)
	jmp	l1
l0:
	movl	-8(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	-8(%ebp),%eax
	movl	-4(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-4(%ebp)
	#--------------------------------------------------
	movl	$1,%eax
	movl	-8(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-8(%ebp)
	#--------------------------------------------------
l1:
	movl	$10,%eax
	movl	-8(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l0
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	$0,%eax
	movl	%eax,-8(%ebp)
	movl	$0,%eax
	movl	%eax,-12(%ebp)
	jmp	l3
l2:
	movl	-12(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	-12(%ebp),%eax
	movl	-8(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-8(%ebp)
	#--------------------------------------------------
	movl	$1,%eax
	movl	-12(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-12(%ebp)
	#--------------------------------------------------
l3:
	movl	$10,%eax
	movl	-12(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l2
	movl	-8(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	$0,%eax
	movl	%eax,-16(%ebp)
	movl	$0,%eax
	movl	%eax,-20(%ebp)
	movl	$5,%eax
	movl	$5,%ecx
	imull	%ecx,%eax
	jmp	l5
l4:
	movl	-20(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	-20(%ebp),%eax
	movl	-16(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-16(%ebp)
	#--------------------------------------------------
	movl	$1,%eax
	movl	-20(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-20(%ebp)
	#--------------------------------------------------
l5:
	movl	$10,%eax
	movl	-20(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l4
	movl	-16(%ebp),%eax
	pushl	%eax
	call	print
	# EPILOGUE-------------------------------------------
	movl	%ebp,%esp
	popl	%ebp
	ret
	#----------------------------------------------------
