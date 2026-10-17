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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Sharp sharp) {
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RamenDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(22.0f, 3.51f, 2.0f, 4.0f, 3.99f);
        j.verticalLineTo(12.0f);
        j.horizontalLineTo(2.0f);
        j.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        kf0.r(j, 22.0f, 8.0f, -1.75f);
        j.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        af0.y(j, 10.5f, 8.0f, 22.0f, 6.5f);
        j.horizontalLineTo(10.5f);
        j.verticalLineTo(4.78f);
        j.lineTo(22.0f, 3.51f);
        j.close();
        kp0.t(j, 6.5f, 5.22f, 6.5f, -1.0f);
        bv.k(j, 5.34f, 6.5f, 5.22f);
        k4.C(j, 5.5f, 8.0f, 1.0f, 4.0f);
        uo.r(j, -1.0f, 8.0f, 9.0f, 12.0f);
        uo.o(j, 8.0f, 8.0f, 1.0f, 12.0f);
        uo.p(j, 9.0f, 6.5f, 8.0f, 5.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(j, 1.0f, -0.11f, 6.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = build;
        build.getClass();
        return build;
    }
}
