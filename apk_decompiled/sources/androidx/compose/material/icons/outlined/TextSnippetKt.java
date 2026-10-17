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
import defpackage.er;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSnippetKt {
    private static ImageVector _textSnippet;

    public static final ImageVector getTextSnippet(Icons.Outlined outlined) {
        ImageVector imageVector = _textSnippet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextSnippet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(14.17f, 5.0f, 19.0f, 9.83f, 19.0f);
        u.horizontalLineTo(5.0f);
        u.verticalLineTo(5.0f);
        u.lineTo(14.17f, 5.0f);
        u.lineTo(14.17f, 5.0f);
        u.moveTo(14.17f, 3.0f);
        u.horizontalLineTo(5.0f);
        u.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        u.verticalLineToRelative(14.0f);
        u.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        u.horizontalLineToRelative(14.0f);
        u.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        u.verticalLineTo(9.83f);
        u.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        u.lineToRelative(-4.83f, -4.83f);
        u.curveTo(15.21f, 3.21f, 14.7f, 3.0f, 14.17f, 3.0f);
        uo.l(u, 14.17f, 3.0f, 7.0f, 15.0f);
        gy.t(u, 10.0f, 2.0f, 7.0f, 15.0f);
        k4.C(u, 7.0f, 11.0f, 10.0f, 2.0f);
        bv.s(u, 7.0f, 11.0f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(u, 7.0f, 2.0f, 7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textSnippet = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getTextSnippet$annotations(Icons.Outlined outlined) {
    }
}
