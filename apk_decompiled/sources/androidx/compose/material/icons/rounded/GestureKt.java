package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GestureKt {
    private static ImageVector _gesture;

    public static final ImageVector getGesture(Icons.Rounded rounded) {
        ImageVector imageVector = _gesture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gesture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.72f, 6.04f);
        b.curveToRelative(0.47f, 0.46f, 1.21f, 0.48f, 1.71f, 0.06f);
        b.curveToRelative(0.37f, -0.32f, 0.69f, -0.51f, 0.87f, -0.43f);
        b.curveToRelative(0.5f, 0.2f, 0.0f, 1.03f, -0.3f, 1.52f);
        b.curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f);
        b.curveToRelative(0.0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f);
        b.curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f);
        b.curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f);
        b.curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f);
        b.curveToRelative(1.63f, 0.0f, 1.65f, 1.01f, 1.76f, 1.79f);
        b.curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f);
        b.curveToRelative(0.0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f);
        b.curveToRelative(1.63f, 0.0f, 4.29f, -1.33f, 4.69f, -6.1f);
        b.horizontalLineToRelative(1.21f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        b.horizontalLineToRelative(-1.22f);
        b.curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f);
        b.curveToRelative(-2.25f, 0.0f, -4.18f, 1.91f, -4.94f, 2.84f);
        b.curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f);
        b.curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f);
        b.curveToRelative(-0.45f, 0.0f, -0.72f, -0.83f, -0.36f, -1.92f);
        b.curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f);
        b.curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f);
        b.curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f);
        b.curveToRelative(-1.09f, 0.0f, -2.04f, 0.63f, -2.7f, 1.22f);
        b.curveToRelative(-0.53f, 0.48f, -0.53f, 1.32f, -0.02f, 1.82f);
        b.close();
        b.moveTo(13.88f, 18.55f);
        b.curveToRelative(-0.31f, 0.0f, -0.74f, -0.26f, -0.74f, -0.72f);
        b.curveToRelative(0.0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f);
        b.curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gesture = build;
        build.getClass();
        return build;
    }
}
