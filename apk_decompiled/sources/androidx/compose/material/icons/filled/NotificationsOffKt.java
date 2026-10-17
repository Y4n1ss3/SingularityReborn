package androidx.compose.material.icons.filled;

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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsOffKt {
    private static ImageVector _notificationsOff;

    public static final ImageVector getNotificationsOff(Icons.Filled filled) {
        ImageVector imageVector = _notificationsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NotificationsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 18.69f, 7.84f, 6.14f);
        i.lineTo(5.27f, 3.49f);
        i.lineTo(4.0f, 4.76f);
        i.lineToRelative(2.8f, 2.8f);
        i.verticalLineToRelative(0.01f);
        i.curveToRelative(-0.52f, 0.99f, -0.8f, 2.16f, -0.8f, 3.42f);
        j50.A(i, 5.0f, -2.0f, 2.0f, 1.0f);
        i.horizontalLineToRelative(13.73f);
        i.lineToRelative(2.0f, 2.0f);
        bv.o(i, 21.0f, 19.72f, -1.0f, -1.03f);
        i.moveTo(12.0f, 22.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        k4.r(i, 18.0f, 14.68f, 18.0f, 11.0f);
        i.curveToRelative(0.0f, -3.08f, -1.64f, -5.64f, -4.5f, -6.32f);
        i.lineTo(13.5f, 4.0f);
        i.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        i.verticalLineToRelative(0.68f);
        i.curveToRelative(-0.15f, 0.03f, -0.29f, 0.08f, -0.42f, 0.12f);
        i.curveToRelative(-0.1f, 0.03f, -0.2f, 0.07f, -0.3f, 0.11f);
        i.horizontalLineToRelative(-0.01f);
        i.curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.01f);
        i.curveToRelative(-0.23f, 0.09f, -0.46f, 0.2f, -0.68f, 0.31f);
        i.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 18.0f, 14.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsOff = build;
        build.getClass();
        return build;
    }
}
