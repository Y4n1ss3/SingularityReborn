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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimCardKt {
    private static ImageVector _simCard;

    public static final ImageVector getSimCard(Icons.Filled filled) {
        ImageVector imageVector = _simCard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SimCard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.99f, 4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        b.horizontalLineToRelative(-8.0f);
        b.lineTo(4.0f, 8.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.01f);
        b.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        fc.B(b, -0.01f, -16.0f, 9.0f, 19.0f);
        af0.m(b, 7.0f, 19.0f, -2.0f, 2.0f);
        bv.m(b, 2.0f, 17.0f, 19.0f, -2.0f);
        r6.p(b, -2.0f, 2.0f, 2.0f);
        b.moveTo(9.0f, 15.0f);
        af0.m(b, 7.0f, 15.0f, -4.0f, 2.0f);
        bv.m(b, 4.0f, 13.0f, 19.0f, -2.0f);
        r6.p(b, -4.0f, 2.0f, 4.0f);
        k4.C(b, 13.0f, 13.0f, -2.0f, -2.0f);
        fc.x(b, 2.0f, 2.0f, 17.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(b, -2.0f, -4.0f, 2.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCard = build;
        build.getClass();
        return build;
    }
}
