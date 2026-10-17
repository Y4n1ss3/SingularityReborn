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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PausePresentationKt {
    private static ImageVector _pausePresentation;

    public static final ImageVector getPausePresentation(Icons.Sharp sharp) {
        ImageVector imageVector = _pausePresentation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PausePresentation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(1.0f, 3.0f, 18.0f, 22.0f);
        r6.C(m, 23.0f, 3.0f, 1.0f, 3.0f);
        m.moveTo(21.0f, 19.0f);
        m.lineTo(3.0f, 19.0f);
        r6.m(m, 3.0f, 5.0f, 18.0f, 14.0f);
        k4.C(m, 9.0f, 8.0f, 2.0f, 8.0f);
        uo.l(m, 9.0f, 16.0f, 13.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(m, 2.0f, 8.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pausePresentation = build;
        build.getClass();
        return build;
    }
}
