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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.Sharp sharp) {
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Coffee", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(18.5f, 3.0f, 4.0f, 8.0f);
        q.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        q.horizontalLineToRelative(0.0f);
        q.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        q.verticalLineToRelative(-1.0f);
        q.lineToRelative(0.4f, 0.0f);
        q.curveToRelative(1.67f, 0.0f, 3.19f, -1.13f, 3.52f, -2.77f);
        q.curveTo(22.39f, 4.98f, 20.67f, 3.0f, 18.5f, 3.0f);
        af0.A(q, 16.0f, 5.0f, 3.0f, 6.0f);
        bv.z(q, 5.0f, 16.0f, 18.5f, 8.0f);
        uf.t(q, 18.0f, 5.0f, 0.5f);
        q.curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        q.reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f);
        r6.B(q, 4.0f, 19.0f, 16.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(q, 4.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = build;
        build.getClass();
        return build;
    }
}
