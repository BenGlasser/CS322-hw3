	.file	"for.s"
	.globl	mini_main
mini_main:
	# PROLOGUE-------------------------------------------
	pushl	%ebp
	movl	%esp,%ebp
	#----------------------------------------------------
	subl	$28,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	movl	$0,%eax
	movl	%eax,-8(%ebp)
	jmp	l1
l0:
	jmp	l2
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
	jmp	l3
l3:
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
l2:
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	$0,%eax
	movl	%eax,-8(%ebp)
	movl	$0,%eax
	movl	%eax,-12(%ebp)
	jmp	l5
l4:
	jmp	l6
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
	jmp	l7
l7:
	movl	$1,%eax
	movl	-12(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-12(%ebp)
	#--------------------------------------------------
l5:
	movl	$10,%eax
	movl	-12(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l4
l6:
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
	jmp	l9
l8:
	jmp	l10
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
	jmp	l11
l11:
	movl	$1,%eax
	movl	-20(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-20(%ebp)
	#--------------------------------------------------
l9:
	movl	$10,%eax
	movl	-20(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l8
l10:
	movl	-16(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	$0,%eax
	movl	%eax,-24(%ebp)
	jmp	l13
l12:
	jmp	l15
l14:
	movl	$42,%eax
	movl	%eax,-28(%ebp)
	movl	-28(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	jmp	l16
l15:
	jmp	l14
l16:
	jmp	l17
	movl	-24(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
l17:
	movl	$1,%eax
	movl	-24(%ebp),%ecx
	addl	%ecx,%eax
	# ASSIGN VAL---------------------------------------
	movl	%eax,-24(%ebp)
	#--------------------------------------------------
l13:
	movl	$5,%eax
	movl	-24(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l12
	movl	$0,%eax
	movl	%eax,-24(%ebp)
	movl	-24(%ebp),%eax
	pushl	%eax
	call	print
	# EPILOGUE-------------------------------------------
	movl	%ebp,%esp
	popl	%ebp
	ret
	#----------------------------------------------------
