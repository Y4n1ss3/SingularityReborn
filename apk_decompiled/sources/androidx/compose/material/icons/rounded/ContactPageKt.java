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
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactPageKt {
    private static ImageVector _contactPage;

    public static final ImageVector getContactPage(Icons.Rounded rounded) {
        ImageVector imageVector = _contactPage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactPage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.17f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(8.83f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.83f, -4.83f);
        d.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        d.close();
        d.moveTo(12.0f, 10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        d.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        d.curveTo(10.0f, 10.9f, 10.9f, 10.0f, 12.0f, 10.0f);
        uo.q(d, 16.0f, 18.0f, 8.0f, -0.57f);
        d.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        d.curveTo(10.07f, 15.21f, 11.01f, 15.0f, 12.0f, 15.0f);
        d.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        d.curveTo(15.52f, 15.9f, 16.0f, 16.62f, 16.0f, 17.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPage = build;
        build.getClass();
        return build;
    }
}
