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
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.Filled filled) {
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WbIridescent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(5.0f, 14.5f, 14.0f, -6.0f);
        bv.r(b, 5.0f, 8.5f, 6.0f);
        b.moveTo(11.0f, 0.55f);
        b.lineTo(11.0f, 3.5f);
        uf.C(b, 2.0f, 13.0f, 0.55f, -2.0f);
        b.moveTo(19.04f, 3.05f);
        b.lineToRelative(-1.79f, 1.79f);
        b.lineToRelative(1.41f, 1.41f);
        fc.C(b, 1.8f, -1.79f, -1.42f, -1.41f);
        b.moveTo(13.0f, 22.45f);
        fc.w(b, 13.0f, 19.5f, -2.0f, 2.95f);
        j50.t(b, 2.0f, 20.45f, 18.54f);
        b.lineToRelative(-1.8f, -1.79f);
        b.lineToRelative(-1.41f, 1.41f);
        fc.C(b, 1.79f, 1.8f, 1.42f, -1.42f);
        b.moveTo(3.55f, 4.46f);
        b.lineToRelative(1.79f, 1.79f);
        b.lineToRelative(1.41f, -1.41f);
        fc.C(b, -1.79f, -1.79f, -1.41f, 1.41f);
        b.moveTo(4.96f, 19.95f);
        b.lineToRelative(1.79f, -1.8f);
        b.lineToRelative(-1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, -1.79f, 1.79f, 1.41f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = build;
        build.getClass();
        return build;
    }
}
