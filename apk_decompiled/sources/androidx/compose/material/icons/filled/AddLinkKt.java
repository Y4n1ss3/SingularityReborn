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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.Filled filled) {
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddLink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(8.0f, 11.0f, 8.0f, 2.0f);
        uo.l(b, 8.0f, 13.0f, 20.1f, 12.0f);
        b.lineTo(22.0f, 12.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        kf0.x(b, -4.0f, 1.9f, 4.0f);
        b.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        b.close();
        b.moveTo(3.9f, 12.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.horizontalLineToRelative(4.0f);
        b.lineTo(11.0f, 7.0f);
        b.lineTo(7.0f, 7.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        bv.C(b, 4.0f, -1.9f, 7.0f, 15.1f);
        b.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        r6.B(b, 19.0f, 12.0f, -2.0f, 3.0f);
        af0.v(b, -3.0f, 2.0f, 3.0f, 3.0f);
        af0.v(b, 2.0f, -3.0f, 3.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLink = build;
        build.getClass();
        return build;
    }
}
