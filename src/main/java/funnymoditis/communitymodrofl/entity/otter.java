// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart rightBackAll;
	private final ModelPart rightFrontAll;
	private final ModelPart leftFrontAll;
	private final ModelPart leftBackAll;
	private final ModelPart allHead;
	private final ModelPart tail;
	private final ModelPart bb_main;

	public custom_model(ModelPart root) {
		this.rightBackAll = root.getChild("rightBackAll");
		this.rightFrontAll = root.getChild("rightFrontAll");
		this.leftFrontAll = root.getChild("leftFrontAll");
		this.leftBackAll = root.getChild("leftBackAll");
		this.allHead = root.getChild("allHead");
		this.tail = root.getChild("tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightBackAll = partdefinition.addOrReplaceChild("rightBackAll", CubeListBuilder.create(), PartPose.offset(0.7795F, 23.4057F, -6.025F));

		PartDefinition rightBackFoot_r1 = rightBackAll.addOrReplaceChild("rightBackFoot_r1", CubeListBuilder.create().texOffs(41, 2).addBox(4.225F, -0.375F, 0.675F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightBackLeg_r1 = rightBackAll.addOrReplaceChild("rightBackLeg_r1", CubeListBuilder.create().texOffs(0, 10).addBox(4.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.525F, 0.3321F, 2.3326F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rightFrontAll = partdefinition.addOrReplaceChild("rightFrontAll", CubeListBuilder.create(), PartPose.offset(0.7795F, 23.4057F, -6.025F));

		PartDefinition rightFrontFoot_r1 = rightFrontAll.addOrReplaceChild("rightFrontFoot_r1", CubeListBuilder.create().texOffs(41, 12).addBox(-4.05F, -0.375F, 4.125F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightFrontLeg_r1 = rightFrontAll.addOrReplaceChild("rightFrontLeg_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.525F, 0.3321F, 2.3326F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftFrontAll = partdefinition.addOrReplaceChild("leftFrontAll", CubeListBuilder.create(), PartPose.offset(5.8045F, 23.0307F, 5.5F));

		PartDefinition leftFrontFeet_r1 = leftFrontAll.addOrReplaceChild("leftFrontFeet_r1", CubeListBuilder.create().texOffs(55, 12).addBox(-10.025F, 0.0F, -4.275F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftFrontLeg_r1 = leftFrontAll.addOrReplaceChild("leftFrontLeg_r1", CubeListBuilder.create().texOffs(15, 10).addBox(-9.5F, -2.65F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftBackAll = partdefinition.addOrReplaceChild("leftBackAll", CubeListBuilder.create(), PartPose.offset(5.8045F, 23.0307F, 5.5F));

		PartDefinition leftBackLeg_r1 = leftBackAll.addOrReplaceChild("leftBackLeg_r1", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -2.65F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftBackFoot_r1 = leftBackAll.addOrReplaceChild("leftBackFoot_r1", CubeListBuilder.create().texOffs(59, 12).addBox(-1.725F, 0.0F, -0.85F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition allHead = partdefinition.addOrReplaceChild("allHead", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -7.0F, 4.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(15, 15).addBox(-3.0F, -5.0F, 4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(22, -1).addBox(-3.5F, -5.0F, 4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, -1).addBox(-3.5F, -5.0F, 6.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 9).addBox(-3.25F, -5.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 8).addBox(-3.75F, -5.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 9).addBox(-2.5F, -6.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 23.0F, -5.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(9.5F, 21.5F, 1.5F));

		PartDefinition lowerTail_r1 = tail.addOrReplaceChild("lowerTail_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition upperTail_r1 = tail.addOrReplaceChild("upperTail_r1", CubeListBuilder.create().texOffs(10, 20).addBox(0.025F, -3.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 21).addBox(0.025F, -2.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, -1.0F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftEar_r1 = bb_main.addOrReplaceChild("leftEar_r1", CubeListBuilder.create().texOffs(11, 22).addBox(-1.0F, -2.625F, -2.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, -3.5874F, 3.7885F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rightEar_r1 = bb_main.addOrReplaceChild("rightEar_r1", CubeListBuilder.create().texOffs(22, 14).addBox(-0.5F, -0.625F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -6.0392F, -0.7449F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightBackAll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightFrontAll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftFrontAll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBackAll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		allHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}