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
	movl	(%esi),%ecx

	addl	%ecx,%eax
	
# assign value*****************************
	movl	8(%ebp),%ecx
	movl	%eax,(%ecx)
	

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
	
# comp args *************************
	movl	-4(%ebp),%eax
	movl	(%esp),%ecx
	movl	%eax,(%ecx)
	#************************************

	call	byref
	movl	%ebp,%esp
	popl	%ebp
	ret
