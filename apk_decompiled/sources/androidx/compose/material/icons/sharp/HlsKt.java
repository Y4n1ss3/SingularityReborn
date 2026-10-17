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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HlsKt {
    private static ImageVector _hls;

    public static final ImageVector getHls(Icons.Sharp sharp) {
        ImageVector imageVector = _hls;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Hls", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(6.5f, 9.0f, 8.0f, 6.0f, 6.5f);
        bv.B(b, -2.5f, -2.0f, 15.0f, 3.0f);
        uf.p(b, 9.0f, 1.5f, 2.0f, 2.0f);
        k4.D(b, 9.0f, 15.5f, 15.0f, 5.0f);
        af0.B(b, -3.5f, 17.0f, -1.0f, 2.0f);
        gy.z(b, 11.0f, 1.5f, 9.0f, -5.0f);
        af0.B(b, 3.5f, 19.0f, 1.0f, -2.0f);
        c21.c(b, 13.0f, -1.5f, 15.0f);
        bv.y(b, 14.0f, 15.0f, -1.5f, -2.5f);
        b.verticalLineTo(9.0f);
        b.horizontalLineTo(10.0f);
        b.verticalLineToRelative(6.0f);
        b.horizontalLineTo(14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hls = build;
        build.getClass();
        return build;
    }
}
