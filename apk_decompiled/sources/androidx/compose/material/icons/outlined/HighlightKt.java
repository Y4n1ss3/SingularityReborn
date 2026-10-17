package androidx.compose.material.icons.outlined;

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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.Outlined outlined) {
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Highlight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(6.0f, 14.0f, 3.0f, 3.0f, 5.0f);
        bv.p(e, 6.0f, -5.0f, 3.0f, -3.0f);
        e.lineTo(18.0f, 9.0f);
        bv.r(e, 6.0f, 9.0f, 5.0f);
        k4.C(e, 8.0f, 11.0f, 8.0f, 2.17f);
        e.lineToRelative(-3.0f, 3.0f);
        fc.w(e, 13.0f, 20.0f, -2.0f, -3.83f);
        gy.B(e, -3.0f, -3.0f, 8.0f, 11.0f);
        k4.C(e, 11.0f, 2.0f, 2.0f, 3.0f);
        j50.t(e, -2.0f, 3.502f, 5.874f);
        e.lineTo(4.916f, 4.46f);
        fc.C(e, 2.122f, 2.12f, -1.414f, 1.415f);
        e.moveTo(16.96f, 6.582f);
        e.lineToRelative(2.123f, -2.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.413f, 1.416f, -2.123f, 2.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = build;
        build.getClass();
        return build;
    }
}
