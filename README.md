# Coffee Glass

A tiny Minecraft Forge 1.20.1 mod that adds exactly one decorative 3D item: coffee in a transparent glass tumbler. Version 1.0.1 uses a redesigned hollow glass silhouette, a clearly visible espresso fill, and a crema top. Its mostly transparent glass texture uses the Forge translucent item render layer.

The model has separate non-overlapping wall, rim and foot geometry, explicit UVs, and tuned first-/third-person and world display transforms. This avoids coplanar duplicate faces that can cause z-fighting. The coffee, glass reflections and crema use custom 32×32 textures.

No crafting recipe. No right-click use. No effects. No blocks or extra gameplay mechanics.

Build with Java 17 using `gradle --no-daemon build`, or download the artifact from GitHub Actions.
