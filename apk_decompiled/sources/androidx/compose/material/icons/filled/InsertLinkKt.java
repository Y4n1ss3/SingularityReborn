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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InsertLinkKt {
    private static ImageVector _insertLink;

    public static final ImageVector getInsertLink(Icons.Filled filled) {
        ImageVector imageVector = _insertLink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.InsertLink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.9f, 12.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.horizontalLineToRelative(4.0f);
        b.lineTo(11.0f, 7.0f);
        b.lineTo(7.0f, 7.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        bv.C(b, 4.0f, -1.9f, 7.0f, 15.1f);
        b.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        r6.B(b, 8.0f, 13.0f, 8.0f, -2.0f);
        bv.r(b, 8.0f, 11.0f, 2.0f);
        k4.C(b, 17.0f, 7.0f, -4.0f, 1.9f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        b.reflectiveCurveToRelative(-1.39f, 3.1f, -3.1f, 3.1f);
        uo.n(b, -4.0f, 13.0f, 17.0f, 4.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -2.24f, -5.0f, -5.0f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertLink = build;
        build.getClass();
        return build;
    }
}
