package androidx.compose.material.icons.twotone;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.TwoTone twoTone) {
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Highlight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(11.0f, 20.0f, 2.0f, -3.83f);
        uo.x(b, 3.0f, -3.0f, 11.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(b, 2.17f, 3.0f, 3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(6.0f, 14.0f, 3.0f, 3.0f, 5.0f);
        bv.p(e, 6.0f, -5.0f, 3.0f, -3.0f);
        e.lineTo(18.0f, 9.0f);
        bv.r(e, 6.0f, 9.0f, 5.0f);
        k4.C(e, 8.0f, 11.0f, 8.0f, 2.17f);
        e.lineToRelative(-3.0f, 3.0f);
        fc.w(e, 13.0f, 20.0f, -2.0f, -3.83f);
        gy.B(e, -3.0f, -3.0f, 8.0f, 11.0f);
        k4.C(e, 11.0f, 2.0f, 2.0f, 3.0f);
        j50.t(e, -2.0f, 4.916f, 4.464f);
        e.lineToRelative(2.12f, 2.122f);
        r6.C(e, 5.62f, 8.0f, 3.5f, 5.877f);
        e.moveTo(18.372f, 8.0f);
        e.lineToRelative(-1.414f, -1.414f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 2.12f, -2.12f, 1.415f, 1.413f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = build;
        build.getClass();
        return build;
    }
}
