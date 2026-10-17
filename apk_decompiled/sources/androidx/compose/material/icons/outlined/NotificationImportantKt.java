package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationImportantKt {
    private static ImageVector _notificationImportant;

    public static final ImageVector getNotificationImportant(Icons.Outlined outlined) {
        ImageVector imageVector = _notificationImportant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationImportant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.01f, 21.01f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        b.reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f);
        j50.t(b, -3.98f, 12.0f, 6.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        bv.q(b, 7.0f, 7.0f, 18.0f, -7.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.close();
        b.moveTo(12.0f, 1.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.verticalLineToRelative(1.17f);
        b.curveTo(7.36f, 4.85f, 5.0f, 7.65f, 5.0f, 11.0f);
        j50.A(b, 6.0f, -2.0f, 2.0f, 1.0f);
        bv.p(b, 18.0f, -1.0f, -2.0f, -2.0f);
        b.verticalLineToRelative(-6.0f);
        b.curveToRelative(0.0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f);
        b.lineTo(13.5f, 3.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        r6.B(b, 11.0f, 8.0f, 2.0f, 4.0f);
        kp0.A(b, -2.0f, 11.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationImportant = build;
        build.getClass();
        return build;
    }
}
