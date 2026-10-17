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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSnippetKt {
    private static ImageVector _textSnippet;

    public static final ImageVector getTextSnippet(Icons.Filled filled) {
        ImageVector imageVector = _textSnippet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextSnippet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.41f, 8.41f, -4.83f, -4.83f);
        e.curveTo(15.21f, 3.21f, 14.7f, 3.0f, 14.17f, 3.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        e.verticalLineToRelative(14.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(9.83f);
        e.curveTo(21.0f, 9.3f, 20.79f, 8.79f, 20.41f, 8.41f);
        r6.B(e, 7.0f, 7.0f, 7.0f, 2.0f);
        bv.s(e, 7.0f, 7.0f, 17.0f, 17.0f);
        bv.h(e, 7.0f, -2.0f, 10.0f, 17.0f);
        k4.A(e, 17.0f, 13.0f, 7.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 10.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textSnippet = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getTextSnippet$annotations(Icons.Filled filled) {
    }
}
