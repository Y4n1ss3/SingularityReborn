package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HttpKt {
    private static ImageVector _http;

    public static final ImageVector getHttp(Icons.Filled filled) {
        ImageVector imageVector = _http;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Http", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.5f, 11.0f, -2.0f, 2.5f, 9.0f);
        af0.m(p, 1.0f, 9.0f, 6.0f, 1.5f);
        uo.B(p, -2.5f, 2.0f, 4.5f, 15.0f);
        p.lineTo(6.0f, 15.0f);
        p.lineTo(6.0f, 9.0f);
        bv.r(p, 4.5f, 9.0f, 2.0f);
        p.moveTo(7.0f, 10.5f);
        p.horizontalLineToRelative(1.5f);
        p.lineTo(8.5f, 15.0f);
        af0.m(p, 10.0f, 15.0f, -4.5f, 1.5f);
        p.lineTo(11.5f, 9.0f);
        bv.r(p, 7.0f, 9.0f, 1.5f);
        p.moveTo(12.5f, 10.5f);
        p.lineTo(14.0f, 10.5f);
        fc.w(p, 14.0f, 15.0f, 1.5f, -4.5f);
        p.lineTo(17.0f, 10.5f);
        r6.m(p, 17.0f, 9.0f, -4.5f, 1.5f);
        p.moveTo(21.5f, 9.0f);
        af0.m(p, 18.0f, 9.0f, 6.0f, 1.5f);
        p.verticalLineToRelative(-2.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        p.verticalLineToRelative(-1.0f);
        p.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        r6.B(p, 21.5f, 11.5f, -2.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, 2.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _http = build;
        build.getClass();
        return build;
    }
}
