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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GifKt {
    private static ImageVector _gif;

    public static final ImageVector getGif(Icons.Sharp sharp) {
        ImageVector imageVector = _gif;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Gif", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(11.5f, 9.0f, 13.0f, 9.0f, 6.0f);
        gy.n(s, -1.5f, 11.5f, 9.0f);
        s.moveTo(10.0f, 9.0f);
        af0.m(s, 5.0f, 9.0f, 6.0f, 5.0f);
        bv.q(s, -3.0f, 8.5f, 12.0f, 1.5f);
        bv.C(s, -2.0f, -3.0f, 10.0f, 10.5f);
        uo.l(s, 10.0f, 9.0f, 19.0f, 10.5f);
        fc.w(s, 19.0f, 9.0f, -4.5f, 6.0f);
        af0.m(s, 16.0f, 15.0f, -2.0f, 2.0f);
        s.verticalLineToRelative(-1.5f);
        s.horizontalLineToRelative(-2.0f);
        s.verticalLineToRelative(-1.0f);
        s.horizontalLineToRelative(3.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gif = build;
        build.getClass();
        return build;
    }
}
