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
import defpackage.bv;
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TerminalKt {
    private static ImageVector _terminal;

    public static final ImageVector getTerminal(Icons.Filled filled) {
        ImageVector imageVector = _terminal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Terminal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.89f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.11f, 4.0f, 20.0f, 4.0f);
        c21.d(d, 20.0f, 18.0f, 4.0f, 8.0f);
        uo.r(d, 16.0f, 18.0f, 18.0f, 17.0f);
        bv.l(d, -6.0f, -2.0f, 6.0f, 17.0f);
        d.moveTo(7.5f, 17.0f);
        d.lineToRelative(-1.41f, -1.41f);
        d.lineTo(8.67f, 13.0f);
        d.lineToRelative(-2.59f, -2.59f);
        d.lineTo(7.5f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 4.0f, 4.0f, 7.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _terminal = build;
        build.getClass();
        return build;
    }
}
