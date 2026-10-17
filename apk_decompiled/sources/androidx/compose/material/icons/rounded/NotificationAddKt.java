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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationAddKt {
    private static ImageVector _notificationAdd;

    public static final ImageVector getNotificationAdd(Icons.Rounded rounded) {
        ImageVector imageVector = _notificationAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.0f, 20.0f, 4.0f);
        a.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        a.reflectiveCurveTo(10.0f, 21.1f, 10.0f, 20.0f);
        a.close();
        a.moveTo(14.0f, 9.0f);
        a.curveToRelative(0.0f, 2.61f, 1.67f, 4.83f, 4.0f, 5.66f);
        a.lineTo(18.0f, 17.0f);
        a.horizontalLineToRelative(1.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(0.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineTo(5.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineToRelative(0.0f);
        a.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.horizontalLineToRelative(1.0f);
        a.verticalLineToRelative(-7.0f);
        a.curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f);
        a.verticalLineTo(3.5f);
        a.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        a.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        a.verticalLineToRelative(0.7f);
        a.curveToRelative(0.71f, 0.18f, 1.36f, 0.49f, 1.95f, 0.9f);
        a.curveTo(14.54f, 6.14f, 14.0f, 7.51f, 14.0f, 9.0f);
        af0.r(a, 23.0f, 8.0f, -2.0f, 6.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(2.0f);
        a.horizontalLineToRelative(-2.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(0.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(2.0f);
        a.verticalLineToRelative(2.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-2.0f);
        a.horizontalLineToRelative(2.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(0.0f);
        a.curveTo(24.0f, 8.45f, 23.55f, 8.0f, 23.0f, 8.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationAdd = build;
        build.getClass();
        return build;
    }
}
