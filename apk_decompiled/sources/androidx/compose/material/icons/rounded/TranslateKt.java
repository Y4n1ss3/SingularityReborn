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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(Icons.Rounded rounded) {
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Translate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.65f, 15.67f);
        b.curveToRelative(0.14f, -0.36f, 0.05f, -0.77f, -0.23f, -1.05f);
        b.lineToRelative(-2.09f, -2.06f);
        b.lineToRelative(0.03f, -0.03f);
        b.curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        b.horizontalLineToRelative(1.94f);
        b.curveToRelative(0.54f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
        b.verticalLineToRelative(-0.02f);
        b.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        b.lineTo(10.0f, 4.0f);
        b.lineTo(10.0f, 3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.lineTo(1.99f, 4.0f);
        b.curveToRelative(-0.54f, 0.0f, -0.99f, 0.45f, -0.99f, 0.99f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f);
        b.horizontalLineToRelative(10.18f);
        b.curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        b.curveToRelative(-0.81f, -0.89f, -1.49f, -1.86f, -2.06f, -2.88f);
        b.curveToRelative(-0.16f, -0.29f, -0.45f, -0.47f, -0.78f, -0.47f);
        b.curveToRelative(-0.69f, 0.0f, -1.13f, 0.75f, -0.79f, 1.35f);
        b.curveToRelative(0.63f, 1.13f, 1.4f, 2.21f, 2.3f, 3.21f);
        b.lineTo(3.3f, 16.87f);
        b.curveToRelative(-0.4f, 0.39f, -0.4f, 1.03f, 0.0f, 1.42f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineTo(9.0f, 14.0f);
        b.lineToRelative(2.02f, 2.02f);
        b.curveToRelative(0.51f, 0.51f, 1.38f, 0.32f, 1.63f, -0.35f);
        b.close();
        b.moveTo(17.5f, 10.0f);
        b.curveToRelative(-0.6f, 0.0f, -1.14f, 0.37f, -1.35f, 0.94f);
        b.lineToRelative(-3.67f, 9.8f);
        b.curveToRelative(-0.24f, 0.61f, 0.22f, 1.26f, 0.87f, 1.26f);
        b.curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.88f, -0.61f);
        b.lineToRelative(0.89f, -2.39f);
        b.horizontalLineToRelative(4.75f);
        b.lineToRelative(0.9f, 2.39f);
        b.curveToRelative(0.14f, 0.36f, 0.49f, 0.61f, 0.88f, 0.61f);
        b.curveToRelative(0.65f, 0.0f, 1.11f, -0.65f, 0.88f, -1.26f);
        b.lineToRelative(-3.67f, -9.8f);
        b.curveToRelative(-0.22f, -0.57f, -0.76f, -0.94f, -1.36f, -0.94f);
        k4.x(b, 15.88f, 17.0f, 1.62f, -4.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(b, 19.12f, 17.0f, -3.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _translate = build;
        build.getClass();
        return build;
    }
}
