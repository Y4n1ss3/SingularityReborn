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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailUnreadKt {
    private static ImageVector _markEmailUnread;

    public static final ImageVector getMarkEmailUnread(Icons.Rounded rounded) {
        ImageVector imageVector = _markEmailUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MarkEmailUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 10.0f);
        b.curveToRelative(1.13f, 0.0f, 2.16f, -0.39f, 3.0f, -1.02f);
        b.verticalLineTo(18.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(10.1f);
        b.curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f);
        b.curveToRelative(0.0f, 1.48f, 0.65f, 2.79f, 1.67f, 3.71f);
        b.lineTo(12.0f, 11.0f);
        b.lineTo(5.3f, 6.81f);
        b.curveTo(4.73f, 6.46f, 4.0f, 6.86f, 4.0f, 7.53f);
        b.curveToRelative(0.0f, 0.29f, 0.15f, 0.56f, 0.4f, 0.72f);
        b.lineToRelative(7.07f, 4.42f);
        b.curveToRelative(0.32f, 0.2f, 0.74f, 0.2f, 1.06f, 0.0f);
        b.lineToRelative(4.77f, -2.98f);
        b.curveTo(17.84f, 9.88f, 18.4f, 10.0f, 19.0f, 10.0f);
        b.close();
        b.moveTo(16.0f, 5.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.0f, 3.34f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailUnread = build;
        build.getClass();
        return build;
    }
}
