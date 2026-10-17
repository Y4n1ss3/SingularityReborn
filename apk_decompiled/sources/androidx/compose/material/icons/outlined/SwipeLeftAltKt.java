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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeLeftAltKt {
    private static ImageVector _swipeLeftAlt;

    public static final ImageVector getSwipeLeftAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _swipeLeftAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeLeftAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.1f, 13.0f);
        b.curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        b.curveToRelative(-2.42f, 0.0f, -4.44f, 1.72f, -4.9f, 4.0f);
        b.horizontalLineTo(5.83f);
        b.lineToRelative(1.59f, -1.59f);
        b.lineTo(6.0f, 8.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineToRelative(1.41f, -1.41f);
        kf0.h(b, 5.83f, 13.0f, 10.1f);
        b.moveTo(15.0f, 15.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.66f, 15.0f, 15.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeLeftAlt = build;
        build.getClass();
        return build;
    }
}
