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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationImportantKt {
    private static ImageVector _notificationImportant;

    public static final ImageVector getNotificationImportant(Icons.Filled filled) {
        ImageVector imageVector = _notificationImportant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NotificationImportant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 16.0f, -5.0f);
        h.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        h.lineTo(13.5f, 4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        h.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        h.verticalLineToRelative(0.68f);
        h.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        j50.A(h, 5.0f, -2.0f, 2.0f, 1.0f);
        j50.u(h, 16.0f, -1.0f, -2.0f, -2.0f);
        k4.C(h, 13.0f, 16.0f, -2.0f, -2.0f);
        fc.x(h, 2.0f, 2.0f, 13.0f, 12.0f);
        uo.n(h, -2.0f, 11.0f, 8.0f, 2.0f);
        r6.l(h, 4.0f, 12.0f, 22.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.horizontalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationImportant = build;
        build.getClass();
        return build;
    }
}
