package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactSupportKt {
    private static ImageVector _contactSupport;

    public static final ImageVector getContactSupport(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ContactSupport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.5f, 2.0f);
        b.curveTo(6.81f, 2.0f, 3.0f, 5.81f, 3.0f, 10.5f);
        b.reflectiveCurveTo(6.81f, 19.0f, 11.5f, 19.0f);
        b.horizontalLineToRelative(0.5f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(4.86f, -2.34f, 8.0f, -7.0f, 8.0f, -11.5f);
        b.curveTo(20.0f, 5.81f, 16.19f, 2.0f, 11.5f, 2.0f);
        r6.B(b, 12.5f, 16.5f, -2.0f, -2.0f);
        fc.x(b, 2.0f, 2.0f, 12.9f, 11.72f);
        b.curveToRelative(-0.01f, 0.01f, -0.02f, 0.03f, -0.03f, 0.05f);
        b.curveToRelative(-0.05f, 0.08f, -0.1f, 0.16f, -0.14f, 0.24f);
        b.curveToRelative(-0.02f, 0.03f, -0.03f, 0.07f, -0.04f, 0.11f);
        b.curveToRelative(-0.03f, 0.07f, -0.06f, 0.14f, -0.08f, 0.21f);
        b.curveToRelative(-0.07f, 0.21f, -0.1f, 0.43f, -0.1f, 0.68f);
        b.lineTo(10.5f, 13.01f);
        b.curveToRelative(0.0f, -0.51f, 0.08f, -0.94f, 0.2f, -1.3f);
        b.curveToRelative(0.0f, -0.01f, 0.0f, -0.02f, 0.01f, -0.03f);
        b.curveToRelative(0.01f, -0.04f, 0.04f, -0.06f, 0.05f, -0.1f);
        b.curveToRelative(0.06f, -0.16f, 0.13f, -0.3f, 0.22f, -0.44f);
        b.curveToRelative(0.03f, -0.05f, 0.07f, -0.1f, 0.1f, -0.15f);
        b.curveToRelative(0.03f, -0.04f, 0.05f, -0.09f, 0.08f, -0.12f);
        b.lineToRelative(0.01f, 0.01f);
        b.curveToRelative(0.84f, -1.1f, 2.21f, -1.44f, 2.32f, -2.68f);
        b.curveToRelative(0.09f, -0.98f, -0.61f, -1.93f, -1.57f, -2.13f);
        b.curveToRelative(-1.04f, -0.22f, -1.98f, 0.39f, -2.3f, 1.28f);
        b.curveToRelative(-0.14f, 0.36f, -0.47f, 0.65f, -0.88f, 0.65f);
        b.horizontalLineToRelative(-0.2f);
        b.curveToRelative(-0.6f, 0.0f, -1.04f, -0.59f, -0.87f, -1.17f);
        b.curveToRelative(0.55f, -1.82f, 2.37f, -3.09f, 4.43f, -2.79f);
        b.curveToRelative(1.69f, 0.25f, 3.04f, 1.64f, 3.33f, 3.33f);
        b.curveToRelative(0.44f, 2.44f, -1.63f, 3.03f, -2.53f, 4.35f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactSupport = build;
        build.getClass();
        return build;
    }
}
