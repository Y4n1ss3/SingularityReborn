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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoneyKt {
    private static ImageVector _money;

    public static final ImageVector getMoney(Icons.Sharp sharp) {
        ImageVector imageVector = _money;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Money", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(14.0f, 16.0f, 5.0f, 19.0f, 8.0f);
        fc.x(p, -5.0f, 8.0f, 16.0f, 10.0f);
        gy.D(p, 1.0f, 4.0f, -1.0f, -4.0f);
        p.moveTo(8.0f, 16.0f);
        p.horizontalLineToRelative(5.0f);
        p.lineTo(13.0f, 8.0f);
        bv.r(p, 8.0f, 8.0f, 8.0f);
        k4.C(p, 10.0f, 10.0f, 1.0f, 4.0f);
        fc.x(p, -1.0f, -4.0f, 5.0f, 8.0f);
        j50.o(p, 2.0f, 8.0f, 5.0f, 16.0f);
        bv.y(p, 2.0f, 4.0f, 16.0f, 20.0f);
        r6.C(p, 22.0f, 4.0f, 2.0f, 4.0f);
        p.moveTo(20.0f, 18.0f);
        p.lineTo(4.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(p, 4.0f, 6.0f, 16.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _money = build;
        build.getClass();
        return build;
    }
}
