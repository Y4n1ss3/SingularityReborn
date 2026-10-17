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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationAddKt {
    private static ImageVector _notificationAdd;

    public static final ImageVector getNotificationAdd(Icons.Outlined outlined) {
        ImageVector imageVector = _notificationAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = fc.d(16.0f, 14.0f, 3.0f, 8.0f, -7.0f);
        d.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        d.curveToRelative(0.85f, 0.0f, 1.64f, 0.26f, 2.28f, 0.72f);
        d.lineToRelative(1.43f, -1.43f);
        d.curveToRelative(-0.64f, -0.51f, -1.39f, -0.88f, -2.21f, -1.09f);
        d.verticalLineTo(3.5f);
        d.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        d.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        d.verticalLineToRelative(0.7f);
        d.curveTo(7.91f, 4.86f, 6.0f, 7.21f, 6.0f, 10.0f);
        af0.B(d, 7.0f, 4.0f, 2.0f, 16.0f);
        fc.y(d, -2.0f, -2.0f, -3.0f, 16.0f);
        d.moveTo(12.0f, 22.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.horizontalLineToRelative(-4.0f);
        d.curveTo(10.0f, 21.1f, 10.9f, 22.0f, 12.0f, 22.0f);
        af0.r(d, 24.0f, 8.0f, -3.0f, 5.0f);
        af0.v(d, -2.0f, 3.0f, -3.0f, 2.0f);
        af0.v(d, 3.0f, 3.0f, 2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 3.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationAdd = build;
        build.getClass();
        return build;
    }
}
