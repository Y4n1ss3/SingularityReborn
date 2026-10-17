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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GasMeterKt {
    private static ImageVector _gasMeter;

    public static final ImageVector getGasMeter(Icons.Sharp sharp) {
        ImageVector imageVector = _gasMeter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.GasMeter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(20.0f, 4.0f, -5.0f, 2.0f, -2.0f);
        bv.B(n, 2.0f, -2.0f, 2.0f, 9.0f);
        af0.B(n, 2.0f, 4.0f, 18.0f, 16.0f);
        bv.t(n, 4.0f, 12.0f, 18.0f);
        n.curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f);
        n.curveToRelative(0.0f, -1.09f, 0.43f, -1.39f, 2.5f, -3.79f);
        n.curveToRelative(2.05f, 2.38f, 2.5f, 2.7f, 2.5f, 3.79f);
        n.curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f);
        c21.d(n, 16.0f, 10.0f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 8.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gasMeter = build;
        build.getClass();
        return build;
    }
}
