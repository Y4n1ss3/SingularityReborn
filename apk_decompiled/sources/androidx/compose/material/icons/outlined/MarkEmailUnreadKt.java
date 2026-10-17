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
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailUnreadKt {
    private static ImageVector _markEmailUnread;

    public static final ImageVector getMarkEmailUnread(Icons.Outlined outlined) {
        ImageVector imageVector = _markEmailUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MarkEmailUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(22.0f, 8.98f, 18.0f);
        d.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.lineTo(2.01f, 6.0f);
        d.curveTo(2.01f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f);
        d.horizontalLineToRelative(10.1f);
        d.curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f);
        d.reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1.0f);
        d.horizontalLineTo(4.0f);
        d.lineToRelative(8.0f, 5.0f);
        d.lineToRelative(3.67f, -2.29f);
        d.curveToRelative(0.47f, 0.43f, 1.02f, 0.76f, 1.63f, 0.98f);
        d.lineTo(12.0f, 13.0f);
        af0.m(d, 4.0f, 8.0f, 10.0f, 16.0f);
        d.verticalLineTo(9.9f);
        d.curveTo(20.74f, 9.75f, 21.42f, 9.42f, 22.0f, 8.98f);
        d.close();
        d.moveTo(16.0f, 5.0f);
        d.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        d.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        d.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 16.0f, 3.34f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailUnread = build;
        build.getClass();
        return build;
    }
}
