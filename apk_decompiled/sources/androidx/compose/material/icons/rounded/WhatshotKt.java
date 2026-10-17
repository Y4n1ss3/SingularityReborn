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
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Rounded rounded) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Whatshot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.09f, 4.56f);
        b.curveToRelative(-0.7f, -1.03f, -1.5f, -1.99f, -2.4f, -2.85f);
        b.curveToRelative(-0.35f, -0.34f, -0.94f, -0.02f, -0.84f, 0.46f);
        b.curveToRelative(0.19f, 0.94f, 0.39f, 2.18f, 0.39f, 3.29f);
        b.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        b.curveToRelative(-1.54f, 0.0f, -2.8f, -0.93f, -3.35f, -2.26f);
        b.curveToRelative(-0.1f, -0.2f, -0.14f, -0.32f, -0.2f, -0.54f);
        b.curveToRelative(-0.11f, -0.42f, -0.66f, -0.55f, -0.9f, -0.18f);
        b.curveToRelative(-0.18f, 0.27f, -0.35f, 0.54f, -0.51f, 0.83f);
        b.curveTo(4.68f, 9.08f, 4.0f, 11.46f, 4.0f, 14.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveToRelative(0.0f, -3.49f, -1.08f, -6.73f, -2.91f, -9.44f);
        b.close();
        b.moveTo(11.71f, 19.0f);
        b.curveToRelative(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        b.curveToRelative(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        b.curveToRelative(1.47f, -0.3f, 2.98f, -0.93f, 4.03f, -1.92f);
        b.curveToRelative(0.28f, -0.26f, 0.74f, -0.14f, 0.82f, 0.23f);
        b.curveToRelative(0.23f, 1.02f, 0.35f, 2.08f, 0.35f, 3.15f);
        b.curveToRelative(0.01f, 2.65f, -2.14f, 4.8f, -4.79f, 4.8f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = build;
        build.getClass();
        return build;
    }
}
