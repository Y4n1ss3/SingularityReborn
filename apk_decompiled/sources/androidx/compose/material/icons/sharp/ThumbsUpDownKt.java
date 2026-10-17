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
import defpackage.af0;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Sharp sharp) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ThumbsUpDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 5.0f, 5.82f, 5.0f);
        i.lineToRelative(0.78f, -3.78f);
        i.lineTo(5.38f, 0.0f);
        i.lineTo(0.0f, 5.38f);
        i.lineTo(0.0f, 14.0f);
        gy.n(i, 9.24f, 12.0f, 7.54f);
        i.moveTo(14.76f, 10.0f);
        i.lineTo(12.0f, 16.46f);
        i.lineTo(12.0f, 19.0f);
        i.horizontalLineToRelative(6.18f);
        i.lineToRelative(-0.78f, 3.78f);
        i.lineTo(18.62f, 24.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 24.0f, 18.62f, 24.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = build;
        build.getClass();
        return build;
    }
}
