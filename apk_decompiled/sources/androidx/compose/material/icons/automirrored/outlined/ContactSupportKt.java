package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactSupportKt {
    private static ImageVector _contactSupport;

    public static final ImageVector getContactSupport(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.ContactSupport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(11.0f, 23.59f, -3.6f);
        h.curveToRelative(-5.01f, -0.26f, -9.0f, -4.42f, -9.0f, -9.49f);
        h.curveTo(2.0f, 5.26f, 6.26f, 1.0f, 11.5f, 1.0f);
        h.reflectiveCurveTo(21.0f, 5.26f, 21.0f, 10.5f);
        h.curveToRelative(0.0f, 4.95f, -3.44f, 9.93f, -8.57f, 12.4f);
        fc.B(h, -1.43f, 0.69f, 11.5f, 3.0f);
        h.curveTo(7.36f, 3.0f, 4.0f, 6.36f, 4.0f, 10.5f);
        h.reflectiveCurveTo(7.36f, 18.0f, 11.5f, 18.0f);
        h.lineTo(13.0f, 18.0f);
        h.verticalLineToRelative(2.3f);
        h.curveToRelative(3.64f, -2.3f, 6.0f, -6.08f, 6.0f, -9.8f);
        h.curveTo(19.0f, 6.36f, 15.64f, 3.0f, 11.5f, 3.0f);
        r6.B(h, 10.5f, 14.5f, 2.0f, 2.0f);
        kp0.A(h, -2.0f, 12.5f, 13.0f, -2.0f);
        h.curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        h.horizontalLineToRelative(-2.0f);
        h.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        h.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        h.curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactSupport = build;
        build.getClass();
        return build;
    }
}
