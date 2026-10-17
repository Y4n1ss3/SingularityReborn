package androidx.compose.material.icons.twotone;

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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeDownAltKt {
    private static ImageVector _swipeDownAlt;

    public static final ImageVector getSwipeDownAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeDownAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeDownAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 9.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(13.0f, 13.9f);
        b2.curveToRelative(2.28f, -0.46f, 4.0f, -2.48f, 4.0f, -4.9f);
        b2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b2.reflectiveCurveTo(7.0f, 6.24f, 7.0f, 9.0f);
        b2.curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f);
        b2.verticalLineToRelative(4.27f);
        b2.lineToRelative(-1.59f, -1.59f);
        b2.lineTo(8.0f, 18.0f);
        b2.lineToRelative(4.0f, 4.0f);
        b2.lineToRelative(4.0f, -4.0f);
        b2.lineToRelative(-1.41f, -1.41f);
        uf.o(b2, 13.0f, 18.17f, 13.9f);
        b2.moveTo(15.0f, 9.0f);
        b2.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        b2.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        b2.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 15.0f, 7.34f, 15.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDownAlt = build;
        build.getClass();
        return build;
    }
}
