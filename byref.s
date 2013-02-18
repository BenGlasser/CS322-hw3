	.file	"byref.s"
	.globl	mini_main
byval:
	pushl	%ebp
	movl	%esp,%ebp
	movl	$1,%eax
	movl	8(%ebp),%ecx
	addl	%ecx,%eax
	
# assign value*****************************
	movl	%eax,8(%ebp)
	

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
	
# ID value*****************************
	movl	8(%ebp),%esi
	movl	%ecx,(%esi)
	

	addl	%ecx,%eax
	
# assign value*****************************
	movl	8(%ebp),%ecx
	movl	%eax,(%ecx)
	

	
# ID value*****************************
	movl	8(%ebp),%ecx
	movl	%eax,(%ecx)
	

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
	subl	$4,%esp
	movl	-4(%ebp),%eax
	movl	%eax,(%esp)
	call	byref
	addl	$4,%esp
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	movl	-4(%ebp),%eax
	movl	%eax,(%esp)
	call	byval
	addl	$4,%esp
	movl	-4(%ebp),%eax
	pushl	%eax
	call	print
	subl	$4,%esp
	movl	$7,%eax
	movl	$6,%ecx
	imull	%ecx,%eax
	movl	%eax,(%esp)
	call	byref
	addl	$4,%esp
	movl	$7,%eax
	movl	$6,%ecx
	imull	%ecx,%eax
	movl	%eax,(%esp)
	call	byval
	movl	%ebp,%esp
	popl	%ebp
	ret
