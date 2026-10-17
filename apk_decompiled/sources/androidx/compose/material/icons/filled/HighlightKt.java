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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.Filled filled) {
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Highlight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(6.0f, 14.0f, 3.0f, 3.0f, 5.0f);
        bv.p(e, 6.0f, -5.0f, 3.0f, -3.0f);
        k4.t(e, 9.0f, 6.0f, 14.0f);
        k4.C(e, 11.0f, 2.0f, 2.0f, 3.0f);
        uo.r(e, -2.0f, 2.0f, 3.5f, 5.88f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(2.12f, 2.12f);
        r6.C(e, 5.62f, 8.0f, 3.5f, 5.88f);
        e.moveTo(16.96f, 6.59f);
        e.lineToRelative(2.12f, -2.12f);
        e.lineToRelative(1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 18.38f, 8.0f, 16.96f, 6.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = build;
        build.getClass();
        return build;
    }
}
