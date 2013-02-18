	.file	"funs.s"
	.globl	mini_main
squares:
	pushl	%ebp
	movl	%esp,%ebp
	subl	$4,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	jmp	l1
l0:
	movl	-4(%ebp),%eax
	movl	-4(%ebp),%ecx
	imull	%ecx,%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	$1,%eax
	movl	-4(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-4(%ebp)
l1:
	movl	$10,%eax
	movl	-4(%ebp),%ecx
	cmpl	%eax,%ecx
	jle	l0
	movl	%ebp,%esp
	popl	%ebp
	ret
answer:
	pushl	%ebp
	movl	%esp,%ebp
	movl	$42,%eax
	movl	%ebp,%esp
	popl	%ebp
	ret
add:
	pushl	%ebp
	movl	%esp,%ebp
	movl	12(%ebp),%eax
	movl	8(%ebp),%ecx
	addl	%ecx,%eax
	movl	%ebp,%esp
	popl	%ebp
	ret
sum:
	pushl	%ebp
	movl	%esp,%ebp
	subl	$8,%esp
	movl	$0,%eax
	movl	%eax,-4(%ebp)
	movl	$0,%eax
	movl	%eax,-8(%ebp)
	jmp	l3
l2:
	movl	$1,%eax
	movl	-4(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-4(%ebp)
	movl	-4(%ebp),%eax
	movl	-8(%ebp),%ecx
	addl	%ecx,%eax
	movl	%eax,-8(%ebp)
l3:
	movl	8(%ebp),%eax
	movl	-4(%ebp),%ecx
	cmpl	%eax,%ecx
	jl	l2
	movl	-8(%ebp),%eax
	pushl	%eax
	call	print
	addl	$4,%esp
	movl	-8(%ebp),%eax
	movl	%ebp,%esp
	popl	%ebp
	ret
mini_main:
	pushl	%ebp
	movl	%esp,%ebp
	call	squares
	subl	$12,%esp
	call	answer
	movl	%eax,(%esp)
	call	sum
	addl	$4,%esp
	movl	%eax,(%esp)
	movl	$12,4(%esp)
	call	add
	addl	$8,%esp
	pushl	%eax
	call	print
	movl	$3,(%esp)
	call	square
	addl	$4,%esp
	pushl	%eax
	call	print
	movl	%ebp,%esp
	popl	%ebp
	ret
