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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderClearKt {
    private static ImageVector _borderClear;

    public static final ImageVector getBorderClear(Icons.Rounded rounded) {
        ImageVector imageVector = _borderClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BorderClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(7.0f, 5.0f, 2.0f, 9.0f, 3.0f);
        bv.r(p, 7.0f, 3.0f, 2.0f);
        k4.C(p, 7.0f, 13.0f, 2.0f, -2.0f);
        bv.r(p, 7.0f, 11.0f, 2.0f);
        k4.C(p, 7.0f, 21.0f, 2.0f, -2.0f);
        bv.r(p, 7.0f, 19.0f, 2.0f);
        k4.C(p, 11.0f, 17.0f, 2.0f, -2.0f);
        fc.x(p, -2.0f, 2.0f, 11.0f, 21.0f);
        gy.D(p, 2.0f, -2.0f, -2.0f, 2.0f);
        k4.C(p, 3.0f, 21.0f, 2.0f, -2.0f);
        bv.r(p, 3.0f, 19.0f, 2.0f);
        k4.C(p, 3.0f, 17.0f, 2.0f, -2.0f);
        bv.r(p, 3.0f, 15.0f, 2.0f);
        k4.C(p, 3.0f, 13.0f, 2.0f, -2.0f);
        bv.r(p, 3.0f, 11.0f, 2.0f);
        p.moveTo(3.0f, 9.0f);
        p.horizontalLineToRelative(2.0f);
        p.lineTo(5.0f, 7.0f);
        bv.r(p, 3.0f, 7.0f, 2.0f);
        p.moveTo(3.0f, 5.0f);
        p.horizontalLineToRelative(2.0f);
        p.lineTo(5.0f, 3.0f);
        bv.r(p, 3.0f, 3.0f, 2.0f);
        k4.C(p, 11.0f, 13.0f, 2.0f, -2.0f);
        fc.x(p, -2.0f, 2.0f, 19.0f, 17.0f);
        gy.D(p, 2.0f, -2.0f, -2.0f, 2.0f);
        k4.C(p, 19.0f, 13.0f, 2.0f, -2.0f);
        fc.x(p, -2.0f, 2.0f, 19.0f, 21.0f);
        gy.D(p, 2.0f, -2.0f, -2.0f, 2.0f);
        p.moveTo(19.0f, 9.0f);
        uo.n(p, 2.0f, 21.0f, 7.0f, -2.0f);
        bv.m(p, 2.0f, 11.0f, 9.0f, 2.0f);
        r6.m(p, 13.0f, 7.0f, -2.0f, 2.0f);
        bv.y(p, 19.0f, 3.0f, 2.0f, 2.0f);
        uf.j(p, 21.0f, 3.0f, -2.0f);
        p.moveTo(11.0f, 5.0f);
        uo.n(p, 2.0f, 13.0f, 3.0f, -2.0f);
        bv.m(p, 2.0f, 15.0f, 21.0f, 2.0f);
        r6.p(p, -2.0f, -2.0f, 2.0f);
        k4.C(p, 15.0f, 13.0f, 2.0f, -2.0f);
        fc.x(p, -2.0f, 2.0f, 15.0f, 5.0f);
        uo.n(p, 2.0f, 17.0f, 3.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderClear = build;
        build.getClass();
        return build;
    }
}
