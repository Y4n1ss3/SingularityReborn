package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.gb0;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", l = {120}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3 extends us0 implements my {
    final /* synthetic */ List<Font> $asyncLoads;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, hm hmVar) {
        super(2, hmVar);
        this.$asyncLoads = list;
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, hmVar);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            List<Font> list = this.$asyncLoads;
            gb0 gb0Var = new gb0(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Font font = list.get(i2);
                if (gb0Var.d(font)) {
                    arrayList.add(font);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
            PlatformFontLoader platformFontLoader = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(p01.d(unVar, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i3), platformFontLoader, null)));
            }
            this.label = 1;
            Object s = p01.s(arrayList2, this);
            vn vnVar = vn.d;
            if (s == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
