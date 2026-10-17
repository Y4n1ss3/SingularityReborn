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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.TwoTone twoTone) {
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone._1xMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(4.0f, 7.0f, 4.0f, 10.0f, 6.0f);
        k4.t(d, 9.0f, 4.0f, 7.0f);
        d.moveTo(15.83f, 11.72f);
        d.lineTo(18.66f, 7.0f);
        d.horizontalLineToRelative(-2.33f);
        d.lineToRelative(-1.66f, 2.77f);
        d.lineTo(13.0f, 7.0f);
        d.horizontalLineToRelative(-2.33f);
        d.lineToRelative(2.83f, 4.72f);
        d.lineTo(10.33f, 17.0f);
        d.horizontalLineToRelative(2.33f);
        d.lineToRelative(2.0f, -3.34f);
        d.lineToRelative(2.0f, 3.34f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(d, 19.0f, 15.83f, 11.72f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1xMobiledata = build;
        build.getClass();
        return build;
    }
}
