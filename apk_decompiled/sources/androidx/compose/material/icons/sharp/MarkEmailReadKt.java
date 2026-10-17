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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailReadKt {
    private static ImageVector _markEmailRead;

    public static final ImageVector getMarkEmailRead(Icons.Sharp sharp) {
        ImageVector imageVector = _markEmailRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MarkEmailRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 19.0f);
        b.curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        b.curveToRelative(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f);
        bv.A(b, 4.0f, 2.0f, 16.0f, 10.08f);
        b.curveTo(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f);
        k4.x(b, 4.0f, 6.0f, 8.0f, 5.0f);
        b.lineToRelative(8.0f, -5.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(-8.0f, 5.0f);
        uf.o(b, 4.0f, 8.0f, 6.0f);
        b.moveTo(17.34f, 22.0f);
        b.lineToRelative(-3.54f, -3.54f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(2.12f, 2.12f);
        b.lineToRelative(4.24f, -4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 23.0f, 16.34f, 17.34f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailRead = build;
        build.getClass();
        return build;
    }
}
