package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailUnreadKt {
    private static ImageVector _markEmailUnread;

    public static final ImageVector getMarkEmailUnread(Icons.Sharp sharp) {
        ImageVector imageVector = _markEmailUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MarkEmailUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 8.98f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(12.1f);
        pathBuilder.curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.48f, 0.65f, 2.79f, 1.67f, 3.71f);
        pathBuilder.lineTo(12.0f, 11.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(8.0f, 5.0f);
        pathBuilder.lineToRelative(5.3f, -3.32f);
        pathBuilder.curveTo(17.84f, 9.88f, 18.4f, 10.0f, 19.0f, 10.0f);
        pathBuilder.curveTo(20.13f, 10.0f, 21.16f, 9.61f, 22.0f, 8.98f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(pathBuilder, 16.0f, 3.34f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailUnread = build;
        build.getClass();
        return build;
    }
}
