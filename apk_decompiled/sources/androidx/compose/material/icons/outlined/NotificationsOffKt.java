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
import defpackage.af0;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsOffKt {
    private static ImageVector _notificationsOff;

    public static final ImageVector getNotificationsOff(Icons.Outlined outlined) {
        ImageVector imageVector = _notificationsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 6.5f);
        b.curveToRelative(2.49f, 0.0f, 4.0f, 2.02f, 4.0f, 4.5f);
        b.verticalLineToRelative(0.1f);
        b.lineToRelative(2.0f, 2.0f);
        b.lineTo(18.0f, 11.0f);
        b.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        b.lineTo(13.5f, 4.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.verticalLineToRelative(0.68f);
        b.curveToRelative(-0.24f, 0.06f, -0.47f, 0.15f, -0.69f, 0.23f);
        b.lineToRelative(1.64f, 1.64f);
        b.curveToRelative(0.18f, -0.02f, 0.36f, -0.05f, 0.55f, -0.05f);
        k4.r(b, 5.41f, 3.35f, 4.0f, 4.76f);
        b.lineToRelative(2.81f, 2.81f);
        b.curveTo(6.29f, 8.57f, 6.0f, 9.74f, 6.0f, 11.0f);
        j50.A(b, 5.0f, -2.0f, 2.0f, 1.0f);
        b.horizontalLineToRelative(14.24f);
        b.lineToRelative(1.74f, 1.74f);
        gy.B(b, 1.41f, -1.41f, 5.41f, 3.35f);
        b.moveTo(16.0f, 17.0f);
        b.lineTo(8.0f, 17.0f);
        b.verticalLineToRelative(-6.0f);
        b.curveToRelative(0.0f, -0.68f, 0.12f, -1.32f, 0.34f, -1.9f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 16.0f, 16.76f, 16.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsOff = build;
        build.getClass();
        return build;
    }
}
