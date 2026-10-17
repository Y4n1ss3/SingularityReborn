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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationNoneKt {
    private static ImageVector _textRotationNone;

    public static final ImageVector getTextRotationNone(Icons.Filled filled) {
        ImageVector imageVector = _textRotationNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(12.75f, 3.0f, -1.5f, 6.5f, 14.0f);
        kf0.B(p, 2.1f, 0.9f, -2.2f, 5.0f);
        p.lineToRelative(0.9f, 2.2f);
        gy.n(p, 2.1f, 12.75f, 3.0f);
        p.moveTo(10.13f, 10.0f);
        p.lineTo(12.0f, 4.98f);
        uf.j(p, 13.87f, 10.0f, -3.74f);
        p.moveTo(20.5f, 18.0f);
        p.lineToRelative(-3.0f, -3.0f);
        bv.q(p, 2.0f, 5.0f, 17.0f, 2.0f);
        p.horizontalLineToRelative(12.5f);
        p.verticalLineToRelative(2.0f);
        p.lineToRelative(3.0f, -3.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationNone = build;
        build.getClass();
        return build;
    }
}
