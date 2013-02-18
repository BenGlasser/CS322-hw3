	.file	"life.s"
	.globl	mini_main
mini_main:
	pushl	%ebp
	movl	%esp,%ebp
	subl	$20,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	movl	$9,%eax
	movl	%eax,-8(%ebp)
	movl	$25,%eax
	movl	-8(%ebp),%ecx
	xchgl	%ecx,%eax
	subl	%ecx,%eax
	movl	%eax,-12(%ebp)
	movl	$0,%eax
	movl	%eax,-16(%ebp)
	movl	$3,%eax
	movl	-12(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-20(%ebp)
	jmp	l1
l0:
	movl	$1,%eax
	movl	-4(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-4(%ebp)
	movl	-4(%ebp),%eax
	movl	-16(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-16(%ebp)
l1:
	movl	$10,%eax
	movl	-4(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l0
	movl	-20(%ebp),%eax
	movl	-16(%ebp),%ecx
	addl	%ecx,%eax
	pushl	%eax
	call	print
	movl	%ebp,%esp
	popl	%ebp
	ret
