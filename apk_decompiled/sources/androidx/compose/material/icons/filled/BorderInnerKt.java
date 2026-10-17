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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderInnerKt {
    private static ImageVector _borderInner;

    public static final ImageVector getBorderInner(Icons.Filled filled) {
        ImageVector imageVector = _borderInner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BorderInner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(3.0f, 21.0f, 2.0f, -2.0f);
        bv.r(b, 3.0f, 19.0f, 2.0f);
        k4.C(b, 7.0f, 21.0f, 2.0f, -2.0f);
        bv.r(b, 7.0f, 19.0f, 2.0f);
        b.moveTo(5.0f, 7.0f);
        af0.m(b, 3.0f, 7.0f, 2.0f, 2.0f);
        uo.l(b, 5.0f, 7.0f, 3.0f, 17.0f);
        bv.C(b, 2.0f, -2.0f, 3.0f, 15.0f);
        r6.l(b, 2.0f, 9.0f, 3.0f);
        af0.m(b, 7.0f, 3.0f, 2.0f, 2.0f);
        uo.l(b, 9.0f, 3.0f, 5.0f, 3.0f);
        af0.m(b, 3.0f, 3.0f, 2.0f, 2.0f);
        uo.l(b, 5.0f, 3.0f, 17.0f, 3.0f);
        kf0.x(b, -2.0f, 2.0f, 2.0f);
        uo.l(b, 17.0f, 3.0f, 19.0f, 9.0f);
        uo.n(b, 2.0f, 21.0f, 7.0f, -2.0f);
        kp0.z(b, 2.0f, 19.0f, 3.0f, 2.0f);
        uf.C(b, 2.0f, 21.0f, 3.0f, -2.0f);
        k4.C(b, 15.0f, 21.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 13.0f, 3.0f);
        bv.C(b, -2.0f, 8.0f, 3.0f, 11.0f);
        r6.D(b, 2.0f, 8.0f, 8.0f, 2.0f);
        r6.D(b, -8.0f, 8.0f, -2.0f, -8.0f);
        uo.l(b, 13.0f, 3.0f, 19.0f, 21.0f);
        gy.D(b, 2.0f, -2.0f, -2.0f, 2.0f);
        k4.C(b, 19.0f, 17.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderInner = build;
        build.getClass();
        return build;
    }
}
