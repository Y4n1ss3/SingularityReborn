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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GifKt {
    private static ImageVector _gif;

    public static final ImageVector getGif(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gif;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Gif", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(11.5f, 9.0f, 13.0f, 9.0f, 6.0f);
        gy.n(s, -1.5f, 11.5f, 9.0f);
        s.moveTo(9.0f, 9.0f);
        s.lineTo(6.0f, 9.0f);
        s.curveToRelative(-0.6f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        s.verticalLineToRelative(4.0f);
        s.curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        bv.q(s, -2.0f, 8.5f, 12.0f, 1.5f);
        bv.C(s, -2.0f, -3.0f, 10.0f, 10.5f);
        s.lineTo(10.0f, 10.0f);
        s.curveToRelative(0.0f, -0.5f, -0.4f, -1.0f, -1.0f, -1.0f);
        k4.r(s, 19.0f, 10.5f, 19.0f, 9.0f);
        bv.C(s, -4.5f, 6.0f, 16.0f, 15.0f);
        r6.D(s, -2.0f, 2.0f, -1.5f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(s, -1.0f, 3.0f), defaultFillType, "", solidColor, 0.87f, null, 0.87f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gif = build;
        build.getClass();
        return build;
    }
}
