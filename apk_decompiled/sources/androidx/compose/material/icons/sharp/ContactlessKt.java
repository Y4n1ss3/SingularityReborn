package androidx.compose.material.icons.sharp;

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
public final class ContactlessKt {
    private static ImageVector _contactless;

    public static final ImageVector getContactless(Icons.Sharp sharp) {
        ImageVector imageVector = _contactless;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Contactless", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 8.46f, 14.45f, 7.1f, 13.83f);
        b.curveToRelative(0.28f, -0.61f, 0.41f, -1.24f, 0.4f, -1.86f);
        b.curveToRelative(-0.01f, -0.63f, -0.14f, -1.24f, -0.4f, -1.8f);
        b.lineToRelative(1.36f, -0.63f);
        b.curveToRelative(0.35f, 0.75f, 0.53f, 1.56f, 0.54f, 2.4f);
        b.curveTo(9.01f, 12.8f, 8.83f, 13.64f, 8.46f, 14.45f);
        k4.x(b, 11.53f, 16.01f, -1.3f, -0.74f);
        b.curveToRelative(0.52f, -0.92f, 0.78f, -1.98f, 0.78f, -3.15f);
        b.curveToRelative(0.0f, -1.19f, -0.27f, -2.33f, -0.8f, -3.4f);
        b.lineToRelative(1.34f, -0.67f);
        b.curveToRelative(0.64f, 1.28f, 0.96f, 2.65f, 0.96f, 4.07f);
        b.curveTo(12.51f, 13.55f, 12.18f, 14.86f, 11.53f, 16.01f);
        k4.x(b, 14.67f, 17.33f, -1.35f, -0.66f);
        b.curveToRelative(0.78f, -1.6f, 1.18f, -3.18f, 1.18f, -4.69f);
        b.curveToRelative(0.0f, -1.51f, -0.4f, -3.07f, -1.18f, -4.64f);
        b.lineToRelative(1.34f, -0.67f);
        b.curveTo(15.56f, 8.45f, 16.0f, 10.23f, 16.0f, 11.98f);
        b.curveTo(16.0f, 13.72f, 15.56f, 15.52f, 14.67f, 17.33f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactless = build;
        build.getClass();
        return build;
    }
}
