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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.Sharp sharp) {
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WbIridescent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 15.0f, 14.0f, 19.0f, 9.05f);
        r6.C(p, 5.0f, 9.05f, 5.0f, 15.0f);
        bv.y(p, 11.0f, 1.0f, 3.0f, 2.0f);
        uf.j(p, 13.0f, 1.0f, -2.0f);
        p.moveTo(19.04f, 3.6f);
        p.lineToRelative(-1.79f, 1.79f);
        p.lineToRelative(1.41f, 1.41f);
        fc.C(p, 1.8f, -1.79f, -1.42f, -1.41f);
        bv.y(p, 13.0f, 23.0f, -2.95f, -2.0f);
        uf.j(p, 11.0f, 23.0f, 2.0f);
        p.moveTo(20.45f, 19.09f);
        p.lineToRelative(-1.8f, -1.79f);
        p.lineToRelative(-1.41f, 1.41f);
        fc.C(p, 1.79f, 1.8f, 1.42f, -1.42f);
        p.moveTo(3.55f, 5.01f);
        p.lineTo(5.34f, 6.8f);
        p.lineToRelative(1.41f, -1.41f);
        r6.C(p, 4.96f, 3.6f, 3.55f, 5.01f);
        p.moveTo(4.96f, 20.5f);
        p.lineToRelative(1.79f, -1.8f);
        p.lineToRelative(-1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, -1.79f, 1.79f, 1.41f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = build;
        build.getClass();
        return build;
    }
}
