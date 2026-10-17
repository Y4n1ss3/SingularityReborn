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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonAddDisabledKt {
    private static ImageVector _personAddDisabled;

    public static final ImageVector getPersonAddDisabled(Icons.Filled filled) {
        ImageVector imageVector = _personAddDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonAddDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(15.0f, 8.0f, -4.0f, 0.0f);
        b.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        b.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(23.0f, 20.0f, -2.0f);
        h.curveToRelative(0.0f, -2.3f, -4.1f, -3.7f, -6.9f, -3.9f);
        uf.r(h, 6.0f, 5.9f, 0.9f);
        h.moveTo(11.4f, 14.5f);
        h.curveTo(9.2f, 15.1f, 7.0f, 16.3f, 7.0f, 18.0f);
        gy.C(h, 2.0f, 9.9f, 4.0f, 4.0f);
        h.lineToRelative(1.3f, -1.3f);
        h.lineToRelative(-21.0f, -20.9f);
        h.lineTo(0.0f, 3.1f);
        h.lineToRelative(4.0f, 4.0f);
        h.lineTo(4.0f, 10.0f);
        af0.m(h, 1.0f, 10.0f, 2.0f, 3.0f);
        r6.D(h, 3.0f, 2.0f, -3.0f, 2.9f);
        fc.B(h, 2.5f, 2.5f, 6.0f, 10.0f);
        h.verticalLineToRelative(-0.9f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(h, 0.9f, 0.9f, 6.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddDisabled = build;
        build.getClass();
        return build;
    }
}
